# Rust API for ympa_rust_axum_server

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.

В числе возможностей интеграции:

* управление каталогом товаров и витриной,

* обработка заказов,

* изменение настроек магазина,

* получение отчетов.


## Overview

This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project. By using the
[OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote
server, you can easily generate a server stub.

To see how to make this your own, look here: [README]((https://openapi-generator.tech))

- API version: LATEST
- Build date: 2024-09-09T22:30:42.091681807Z[Etc/UTC]
- Generator version: 7.8.0



This autogenerated project defines an API crate `ympa_rust_axum_server` which contains:
* An `Api` trait defining the API in Rust.
* Data types representing the underlying data model.
* Axum router which accepts HTTP requests and invokes the appropriate `Api` method for each operation.
  * Request validations (path, query, body params) are included.

## Using the generated library

The generated library has a few optional features that can be activated through Cargo.

* `server`
    * This defaults to enabled and creates the basic skeleton of a server implementation based on Axum.
    * To create the server stack you'll need to provide an implementation of the API trait to provide the server function.
* `conversions`
    * This defaults to disabled and creates extra derives on models to allow "transmogrification" between objects of structurally similar types.

See https://doc.rust-lang.org/cargo/reference/manifest.html#the-features-section for how to use features in your `Cargo.toml`.

### Example

```rust
struct ServerImpl {
   // database: sea_orm::DbConn,
}

#[allow(unused_variables)]
#[async_trait]
impl ympa_rust_axum_server::Api for ServerImpl {
  // API implementation goes here
}

pub async fn start_server(addr: &str) {
    // initialize tracing
    tracing_subscriber::fmt::init();

    // Init Axum router
    let app = ympa_rust_axum_server::server::new(Arc::new(ServerImpl));

    // Add layers to the router
    let app = app.layer(...);

    // Run the server with graceful shutdown
    let listener = TcpListener::bind(addr).await.unwrap();
    axum::serve(listener, app)
        .with_graceful_shutdown(shutdown_signal())
        .await
        .unwrap();
}

async fn shutdown_signal() {
    let ctrl_c = async {
        signal::ctrl_c()
            .await
            .expect("failed to install Ctrl+C handler");
    };

    #[cfg(unix)]
    let terminate = async {
        signal::unix::signal(signal::unix::SignalKind::terminate())
            .expect("failed to install signal handler")
            .recv()
            .await;
    };

    #[cfg(not(unix))]
    let terminate = std::future::pending::<()>();

    tokio::select! {
        _ = ctrl_c => {},
        _ = terminate => {},
    }
}
```
