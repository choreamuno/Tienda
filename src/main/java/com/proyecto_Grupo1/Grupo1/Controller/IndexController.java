package com.proyecto_Grupo1.Grupo1.Controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@Slf4j

public class IndexController
{
  
    @GetMapping("/")
   public String inicio()
   {
       return "Index";
   }
   
   @GetMapping ("GuiaDeUso")
   public String guia()
   {
       return "/GuiaDeUso/GuiaDeUso";
   }
   
   @GetMapping ("Catalogo")
   public String catalogo()
   {
       return "/Catalogo/catalogo";
   }
           
   
   
//   @GetMapping("/nuevoCliente")
//   public String nuevoCliente(Cliente cliente){
//       return "Agregar";
//   }
//   
//   @PostMapping("/guardarCliente")
//   public String guardarCliente(Cliente cliente)
//   {
//       clienteService.save(cliente);
//       return "redirect:/";
//   }
//   
//   @GetMapping("/modificarCliente/{idcliente}")
//   public String modificarCliente(Cliente cliente, Model model)
//   {
//       cliente = clienteService.getCliente(cliente);
//       model.addAttribute("cliente",cliente);
//       return "modificar";
//   }
//   
//   
//   @GetMapping("/eliminarCliente/{idcliente}")
//   public String eliminarCliente(Cliente cliente, Model model)
//   {
//       
//       clienteService.delete(cliente);
//       return "redirect:/";
//   }
   
}
