package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TariffsApiVerticle())
}

class TariffsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.TariffsApiImpl").newInstance() as TariffsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TariffsApi.address)
            .register(TariffsApi::class.java,instance)
    }
}