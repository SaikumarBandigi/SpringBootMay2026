package com.sb.SpringBootMay2026.actuatorTut.controller;
/*
In Spring Boot, Actuator support means a set of built-in tools that help you monitor, manage,
and inspect your application at runtime.

It is provided by the dependency:
spring-boot-starter-actuator

Once enabled, it exposes ready-made endpoints that show internal application information like:

App health
Metrics
Environment properties
Beans in the container
Request mappings
Thread dumps

 */

public class ActuatorTut {
}
/*
Common Actuator Endpoints

After starting the app, you can access:

1. Health Check
/actuator/health

👉 Shows if app is UP or DOWN

Example response:

{
  "status": "UP"
}
2. Application Info
/actuator/info

👉 Custom app details (version, name, etc.)

3. Beans
/actuator/beans

👉 Shows all Spring beans loaded in container

4. Mappings
/actuator/mappings

👉 Shows all REST endpoints in your app

5. Environment
/actuator/env

👉 Shows all config properties

6. Metrics
/actuator/metrics

👉 JVM memory, CPU, HTTP requests, etc.

⚙️ Enable Actuator endpoints in application.properties

By default, only a few endpoints are exposed.

To expose all:

management.endpoints.web.exposure.include=*

Or specific ones:

management.endpoints.web.exposure.include=health,info,metrics
🔐 Why Actuator is used in real projects
Production monitoring
Health checks for Kubernetes / cloud
Debugging live applications
Observability (metrics + logs + tracing)
DevOps integration (Prometheus, Grafana)

 */