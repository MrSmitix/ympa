package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CategoriesApiVerticle())
}

class CategoriesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.CategoriesApiImpl").newInstance() as CategoriesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CategoriesApi.address)
            .register(CategoriesApi::class.java,instance)
    }
}