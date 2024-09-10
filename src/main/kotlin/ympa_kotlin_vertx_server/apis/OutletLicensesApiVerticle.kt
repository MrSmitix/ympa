package ympa_kotlin_vertx_server.apis
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OutletLicensesApiVerticle())
}

class OutletLicensesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("ympa_kotlin_vertx_server.apis.OutletLicensesApiImpl").newInstance() as OutletLicensesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OutletLicensesApi.address)
            .register(OutletLicensesApi::class.java,instance)
    }
}