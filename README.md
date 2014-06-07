springmvc
=========

Learning Spring MVC 4.0 by developing simple web apps that use the framework. New ideas and tests will be put into this repository before they make its way to my private projects. 

### Currently implemented: ###

* Registration form including simple and complex validation:
  * Simple validation is handled via annotations on the RegistrationForm object
  * Complex validation is handled via RegistrationFormValidator which checks password_confirmation matches password

* Exception Handling of RegistrationException
  * RegistrationException can be thrown at any time by the domain layer of the application. Once this exception is thrown, the presentation layer responsible for spawning the request will handle it. For the web framework, we will simply re-route to an error page but eventually we will handle it a little better. 

* Persistent storage with Hibernate
  * Registration of a Domain object (User) through a Data Access Object (UserDAO)
  * Automatic timestamp of created_at and updated_at for User object
  * Object relationships: User has an Address which is set up as a one-to-one relationship. 
  * Loading a user via username from database
