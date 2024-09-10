package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OutletsApiVerticle())
}

class OutletsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OutletsApiImpl").newInstance() as OutletsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OutletsApi.address)
            .register(OutletsApi::class.java,instance)
    }
}