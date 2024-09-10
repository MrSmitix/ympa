package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OffersApiVerticle())
}

class OffersApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OffersApiImpl").newInstance() as OffersApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OffersApi.address)
            .register(OffersApi::class.java,instance)
    }
}