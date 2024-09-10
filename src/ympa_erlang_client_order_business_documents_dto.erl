-module(ympa_erlang_client_order_business_documents_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_business_documents_dto/0]).

-type ympa_erlang_client_order_business_documents_dto() ::
    #{ 'upd' => ympa_erlang_client_document_dto:ympa_erlang_client_document_dto(),
       'ukd' => ympa_erlang_client_document_dto:ympa_erlang_client_document_dto(),
       'torgTwelve' => ympa_erlang_client_document_dto:ympa_erlang_client_document_dto(),
       'sf' => ympa_erlang_client_document_dto:ympa_erlang_client_document_dto(),
       'ksf' => ympa_erlang_client_document_dto:ympa_erlang_client_document_dto()
     }.

encode(#{ 'upd' := Upd,
          'ukd' := Ukd,
          'torgTwelve' := TorgTwelve,
          'sf' := Sf,
          'ksf' := Ksf
        }) ->
    #{ 'upd' => Upd,
       'ukd' => Ukd,
       'torgTwelve' => TorgTwelve,
       'sf' => Sf,
       'ksf' => Ksf
     }.
