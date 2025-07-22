import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.coAwait
import io.vertx.openapi.contract.OpenAPIContract

suspend fun main() {
    val vertx = Vertx.vertx()
    try {
        OpenAPIContract.from(vertx, "openapi.yaml").coAwait()
    } catch (e: Exception) {
        System.err.println(e.message)
    } finally {
        vertx.close()
    }
}
