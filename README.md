# Apache CXF MTOM PoC
Spring Boot web app, web service that can be used to upload binary files using MTOM, Message Transmission Optimization Mechanism. Files are strored
on disk using Commons-IO buffered operations. The idea is to ensure that
an arbitrary number of files of arbitrary size can be uploaded without
expensive in-memory XML handling.

Technologies used:
* Spring Boot
* Jetty
* JAXB
* Apache CXF
* Apache Commons-IO
* iText (for generating example files)

As a basis "SOAP Services with MTOM" (Blog post)[http://www.briansjavablog.com/2017/06/soap-services-with-mtom.html]
was used. Both upload and download, with several files, are demonstrated here.

See WSDL for available SOAP MTOM service methods.

# Usage
Configure the directory in which files are to be output in application.properties. The directory will be created if it does not yet exist.

Compile with Maven and run with Java.

WSDL can then be found here:
http://localhost:8080/mtom-demo/service?wsdl

I used SoapUI to test. MTOM must then be enabled in the project, and you need to manually ensure that file attachment names correspond to cid
identifiers in tha payload. When serving MTOM files, JAXB takes care of this automatically.

SoapUI test project, with example files inside, can be found in the root directory.

The service prints out the incoming and outgoing messages to show the
MTOM structure.