mvn spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000" -Dspring-boot.run.arguments="--spring.datasource.password=Harlosh123"