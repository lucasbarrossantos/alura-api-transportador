package br.com.alura.microservice.transportador.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.transportador.dto.EntregaDTO;
import br.com.alura.microservice.transportador.dto.VoucherDTO;
import br.com.alura.microservice.transportador.model.Entrega;
import br.com.alura.microservice.transportador.service.EntregaService;

@RestController
@RequestMapping("/entrega")
public class EntregaController {
	private final Logger log = LoggerFactory.getLogger(EntregaController.class);

	@Autowired
	private EntregaService entregaService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody EntregaDTO pedidoDTO) {
		log.info("Recebido informações para reserva de entrega.");
		return entregaService.reservaEntrega(pedidoDTO);
	}
}
