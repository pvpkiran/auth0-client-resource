# Reference Documentation
This application acts as API Gateway / Oauth2 client. 

Exposes two endpoints
1. **/hello-client** endpoint which is protected and served via this application running on 8080
2. **/hello-resource** endpoint which is also protected and served via the resource server running on 8090.   
   The call is routed by the Cloud Gateway