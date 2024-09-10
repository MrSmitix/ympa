package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(HiddenOffersApiVerticle())
}

class HiddenOffersApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.HiddenOffersApiImpl").newInstance() as HiddenOffersApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(HiddenOffersApi.address)
            .register(HiddenOffersApi::class.java,instance)
    }
}