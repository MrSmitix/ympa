package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PromosApiVerticle())
}

class PromosApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.PromosApiImpl").newInstance() as PromosApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PromosApi.address)
            .register(PromosApi::class.java,instance)
    }
}