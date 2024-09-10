-module(ympa_erlang_client_document_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_document_dto/0]).

-type ympa_erlang_client_document_dto() ::
    #{ 'status' => ympa_erlang_client_order_document_status_type:ympa_erlang_client_order_document_status_type(),
       'number' => binary(),
       'date' => calendar:date()
     }.

encode(#{ 'status' := Status,
          'number' := Number,
          'date' := Date
        }) ->
    #{ 'status' => Status,
       'number' => Number,
       'date' => Date
     }.
