-module(ympa_erlang_proper_client_order_business_documents_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_business_documents_dto/0]).

-export([ympa_erlang_proper_client_order_business_documents_dto/1]).

-export_type([ympa_erlang_proper_client_order_business_documents_dto/0]).

-type ympa_erlang_proper_client_order_business_documents_dto() ::
  [ {'upd', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
  | {'ukd', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
  | {'torgTwelve', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
  | {'sf', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
  | {'ksf', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
  ].


ympa_erlang_proper_client_order_business_documents_dto() ->
    ympa_erlang_proper_client_order_business_documents_dto([]).

ympa_erlang_proper_client_order_business_documents_dto(Fields) ->
  Default = [ {'upd', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
            , {'ukd', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
            , {'torgTwelve', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
            , {'sf', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
            , {'ksf', ympa_erlang_proper_client_document_dto:ympa_erlang_proper_client_document_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

