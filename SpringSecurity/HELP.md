# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.security)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.security.oauth2.server)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.nosql.ldap)
* [Okta Spring Boot documentation](https://github.com/okta/okta-spring-boot#readme)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.security.oauth2.client)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.security.oauth2.authorization-server)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Okta-Hosted Login Page Example](https://github.com/okta/samples-java-spring/tree/master/okta-hosted-login)
* [Custom Login Page Example](https://github.com/okta/samples-java-spring/tree/master/custom-login)
* [Okta Spring Security Resource Server Example](https://github.com/okta/samples-java-spring/tree/master/resource-server)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

## OAuth 2.0 and OIDC with Okta

If you don't have a free Okta developer account, you can create one with [the Okta CLI](https://cli.okta.com):

```bash
$ okta register
```

Then, register your Spring Boot app on Okta using:

```bash
$ okta apps create
```

Select **Web** > **Okta Spring Boot Starter** and accept the default redirect URIs.

