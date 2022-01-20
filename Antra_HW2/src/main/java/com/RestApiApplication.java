package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }
}

/**
 *  *  1. rest api with SpringBoot[SpringMVC] (TDD + exception handling + pagination + DTO)
 *  *  2. thread safe of server
 *  *  3. what is good api
 *  *  4. TDD on algorithm questions
 *
 *  Postman
 *
 *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
 *  spring MVC
 *  request -> DispatcherServlet -> handlerMapping  ->  controller
 *                  |
 *      ViewResolver / HttpMessageConverter(jackson => json)
 *  {
 *      "name": "Tom",
 *      "age" :..,
 *      "address": {
 *          ..
 *      }
 *  }
 *
 *  question:
 *      1. provide endpoint to retrieve all employees (points, assignee..)
 *          url: /employee?firstName=&age=..&page_count=..
 *          http method: get
 *          status code: 200 OK / 500 Internal Error / 403 authorization fail / 400 bad request
 *          header : Accept = json / xml
 *                   Authorization = token
 *                   ..
 *          response body:
 *                  {
 *                      "time_stamp" :..
 *                      "page_count" : 50,
 *                      "page_number" : 1,
 *                      "total_count" : 10000,
 *                      "data": [
 *                          {
 *                              "id": "asdf-sdf-sdfsd-sdf",
 *                              "first_name": ..,
 *                              "last_name": ..
 *                          },
 *                          {
 *                              "id": "ertg-asdff-werwe-dfd",
 *  *                           "first_name": ..,
 *  *                           "last_name": ..
 *                          },
 *                          ...
 *                      ]
 *                  }
 *
 *                  {
 *                      "time_stamp":..,
 *                      "message" : "server has internal error, cannot ..",
 *                      ..
 *                  }
 *
 *          table design:
 *                 Employee(id, first_name, last_name, ..)
 *
 *
 *
 *      2. give you input string, return true if string is palindrome
 *          input + constraint:
 *              1. "Aa" => T / F
 *              2. null => T / F / exception
 *              3. ""   => T / F
 *              4. "$1#" => T / F
 *              5. "aaa b   aaa" => T / F
 *              6. ..
 *
 *
 * @ControllerAdvice => global exception handling
 *
 *
 * homework
 *      1. student + class application
 *      2. do not use @manytomany
 *      3. build endpoints to get / delete / update / create student and class
 *         register student with class
 *      4. handle exception + log
 * due : next Thursday, 8pm cdt
 */

