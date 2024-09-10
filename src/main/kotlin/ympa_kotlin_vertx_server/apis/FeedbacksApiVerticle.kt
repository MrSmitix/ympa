package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FeedbacksApiVerticle())
}

class FeedbacksApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.FeedbacksApiImpl").newInstance() as FeedbacksApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FeedbacksApi.address)
            .register(FeedbacksApi::class.java,instance)
    }
}