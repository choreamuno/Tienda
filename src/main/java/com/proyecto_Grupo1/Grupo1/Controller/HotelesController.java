package com.proyecto_Grupo1.Grupo1.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@Slf4j

public class HotelesController
{
  
   @GetMapping ("H1SJ")
   public String H1SJ()
   {
       return "/Hoteles/HSanJose1";
   }
    @GetMapping ("H2SJ")
   public String H2SJ()
   {
       return "/Hoteles/HSanJose2";
   }
    @GetMapping ("H3SJ")
   public String H3SJ()
   {
       return "/Hoteles/HSanJose3";
   }
   
   
   
    @GetMapping ("H1A")
   public String H1A()
   {
       return "/Hoteles/HAlajuela1";
   }
    @GetMapping ("H2A")
   public String H2A()
   {
       return "/Hoteles/HAlajuela2";
   }
    @GetMapping ("H3A")
   public String H3A()
   {
       return "/Hoteles/HAlajuela3";
   }
   
   
   
    @GetMapping ("H1C")
   public String H1C()
   {
       return "/Hoteles/HCartago1";
   }
    @GetMapping ("H2C")
   public String H2C()
   {
       return "/Hoteles/HCartago2";
   }
    @GetMapping ("H3C")
   public String H3C()
   {
       return "/Hoteles/HCartago3";
   }
   
   
     @GetMapping ("H1H")
   public String H1H()
   {
       return "/Hoteles/HHeredia1";
   }
   @GetMapping ("H2H")
   public String H2H()
   {
       return "/Hoteles/HHeredia2";
   }
   @GetMapping ("H3H")
   public String H3H()
   {
       return "/Hoteles/HHeredia3";
   }
   
   
   @GetMapping ("H1P")
   public String H1P()
   {
       return "/Hoteles/HPuntarenas1";
   }
   @GetMapping ("H2P")
   public String H2P()
   {
       return "/Hoteles/HPuntarenas2";
   }
   @GetMapping ("H3P")
   public String H3P()
   {
       return "/Hoteles/HPuntarenas3";
   }
   
   
   
   @GetMapping ("H1G")
   public String H1G()
   {
       return "/Hoteles/HGuanacaste1";
   }
   @GetMapping ("H2G")
   public String H2G()
   {
       return "/Hoteles/HGuanacaste2";
   }
   @GetMapping ("H3G")
   public String H3G()
   {
       return "/Hoteles/HGuanacaste3";
   }
   
   
   
   @GetMapping ("H1L")
   public String H1L()
   {
       return "/Hoteles/HLimon1";
   }
   @GetMapping ("H2L")
   public String H2L()
   {
       return "/Hoteles/HLimon2";
   }
   @GetMapping ("H3L")
   public String H3L()
   {
       return "/Hoteles/HLimon3";
   }
   
  

   
}
