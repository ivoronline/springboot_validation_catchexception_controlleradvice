package com.ivoronline.springboot_validation_catchexception_controlleradvice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Controller
@Validated
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello(
    @RequestParam @NotBlank String  name,
    @RequestParam @NotNull  Integer age
  ) {
    return "Hello " + name;
  }

}
