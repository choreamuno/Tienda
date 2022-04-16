package com.proyecto_Grupo1.Grupo1.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@Slf4j

public class CatalogoController
{
  
   @GetMapping ("SanJose")
   public String sanjose()
   {
       return "/Catalogo/1SanJose";
   }
   
   @GetMapping ("Alajuela")
   public String alajuela()
   {
       return "/Catalogo/2Alajuela";
   }
   
    @GetMapping ("Cartago")
   public String cartago()
   {
       return "/Catalogo/3Cartago";
   }
   
    @GetMapping ("Heredia")
   public String heredia()
   {
       return "/Catalogo/4Heredia";
   }
   
    @GetMapping ("Puntarenas")
   public String puntarenas()
   {
       return "/Catalogo/5Puntarenas";
   }
   
   @GetMapping ("Guanacaste")
   public String guanacaste()
   {
       return "/Catalogo/6Guanacaste";
   }
   
   @GetMapping ("Limon")
   public String limon()
   {
       return "/Catalogo/7Limon";
   }

   
}
