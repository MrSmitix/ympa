package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BusinessOfferMappingsApiVerticle())
}

class BusinessOfferMappingsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.BusinessOfferMappingsApiImpl").newInstance() as BusinessOfferMappingsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BusinessOfferMappingsApi.address)
            .register(BusinessOfferMappingsApi::class.java,instance)
    }
}