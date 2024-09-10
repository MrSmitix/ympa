package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(RegionsApiVerticle())
}

class RegionsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.RegionsApiImpl").newInstance() as RegionsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(RegionsApi.address)
            .register(RegionsApi::class.java,instance)
    }
}