Spring Boot Auto Configuration for Spring Security

Spring Boot auto configures below features:

• spring-boot-starter-security starter that aggregates Spring Security-related dependencies together.

• Enables Spring Security's default configuration, which creates a servlet Filter as a bean named springSecurityFilterChain. Provides default login form for you.

• Creates default user with a username as user and a randomly generated password that is logged to the console (Ex: 8e557245-73e2-4286-969a-ff57fe326336).

• Spring boot provides properties to cusomize default user's username and password

• Protects the password storage with BCrypt algorithm

• Lets the user log out (default logout feature)

• CSRF attack prevention (enabled by default)

• If Spring Security is on the classpath, Spring Boot automatically secures all HTTP endpoints with "basic" authentication.
