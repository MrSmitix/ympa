package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OfferMappingsApiVerticle())
}

class OfferMappingsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OfferMappingsApiImpl").newInstance() as OfferMappingsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OfferMappingsApi.address)
            .register(OfferMappingsApi::class.java,instance)
    }
}