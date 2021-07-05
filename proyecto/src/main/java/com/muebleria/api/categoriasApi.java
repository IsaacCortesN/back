package com.muebleria.api;

import java.util.List;

import com.muebleria.model.Categorias;
import com.muebleria.model.DTO.CategoriasDTO;
import com.muebleria.service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api/categorias")
public class categoriasApi {

    @Autowired
    CategoriasService categoriasService;

    @PostMapping("/addCategoria/{categorias}/{tipocategorias}")
    public Categorias addUsuario(@PathVariable("categorias")String categorias,@PathVariable("tipocategorias")String tipocategorias){
        return categoriasService.agregarCategorias(categorias, tipocategorias);
    }

    @GetMapping("/getCategorias")
    public List<Categorias> getUsuarios(){
        return categoriasService.buscarCategorias();
    }

    @PostMapping("/editCategoria")
    public Categorias editUsuario(@RequestBody CategoriasDTO detalle){
        return categoriasService.editarCategorias(detalle);
    }

    @PostMapping("/deleteCategoria/{idCategoria}")
    public Categorias deleteUsuario(@PathVariable("idCategoria") Integer idCategoria){
        return categoriasService.eliminarCategorias(idCategoria);
    }
}
