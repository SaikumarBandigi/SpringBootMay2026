package com.sb.SpringBootMay2026.controller;

/*
@Autowired works with @Component or @Configuration with @Bean
if @Component then below applies

 */
/*   Dog extends Animal
@Autowired
   ↓
By Type
   ↓
If multiple beans
   ↓
By Field Name (matches with bean name)
   ↓
If still ambiguous
   ↓
Exception
 */

/*

if with @Configuration with @Bean

//@Configuration
//public class AppConfig {
//
//    @Bean
//    public Animal dog() {
//        return new Dog();
//    }
//
//}

then check object then @Autowired
 private Animal obj
 private Animal animal
 private Animal dog        doesnt matter

 since Animal is now Dog object

 */
public class AmbiquityDIResolution {


}


