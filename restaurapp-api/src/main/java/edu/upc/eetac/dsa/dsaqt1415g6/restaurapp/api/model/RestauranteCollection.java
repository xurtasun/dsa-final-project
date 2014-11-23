package edu.upc.eetac.dsa.dsaqt1415g6.restaurapp.api.model;

import java.util.List;

import javax.ws.rs.core.Link;

import org.glassfish.jersey.linking.Binding;
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLinks;
import org.glassfish.jersey.linking.InjectLink.Style;

import edu.upc.eetac.dsa.dsaqt1415g6.restaurapp.api.MediaType;
import edu.upc.eetac.dsa.dsaqt1415g6.restaurapp.api.RestauranteResource;

public class RestauranteCollection {
	
	
	@InjectLinks({
		@InjectLink(resource = RestauranteResource.class, style = Style.ABSOLUTE, rel = "crear-restaurante", title = "Crear Restaurante", type = MediaType.RESTAURAPP_API_RESTAURATE),
		@InjectLink(value = "/restaurantes?last={last}", style = Style.ABSOLUTE, rel = "anterior", title = "Restaurantes anteriores", type = MediaType.RESTAURAPP_API_RESTAURANTE_COLLECTION, bindings = { @Binding(name = "last", value = "${instance.anterioresRestaurantes}") }),//$-->toda {}--> valor deseado
		@InjectLink(value = "/restaurantes?next={next}", style = Style.ABSOLUTE, rel = "siguiente", title = "Siguientes restaurantes", type = MediaType.RESTAURAPP_API_RESTAURANTE_COLLECTION, bindings = { @Binding(name = "next", value = "${instance.siguientesRestaurantes}") }) })
private List<Link> links;
private List<Restaurante> restaurante;
private long siguientesRestaurantes;
private long anterioresRestaurantes;


public List<Link> getLinks() {
	return links;
}
public void setLinks(List<Link> links) {
	this.links = links;
}
public List<Restaurante> getRestaurante() {
	return restaurante;
}
public void setRestaurante(List<Restaurante> restaurante) {
	this.restaurante = restaurante;
}
public long getSiguientesRestaurantes() {
	return siguientesRestaurantes;
}
public void setSiguientesRestaurantes(long siguientesRestaurantes) {
	this.siguientesRestaurantes = siguientesRestaurantes;
}
public long getAnterioresRestaurantes() {
	return anterioresRestaurantes;
}
public void setAnterioresRestaurantes(long anterioresRestaurantes) {
	this.anterioresRestaurantes = anterioresRestaurantes;
}

}
