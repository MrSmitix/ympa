package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ExpressApiVerticle())
}

class ExpressApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.ExpressApiImpl").newInstance() as ExpressApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ExpressApi.address)
            .register(ExpressApi::class.java,instance)
    }
}