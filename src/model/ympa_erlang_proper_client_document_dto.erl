-module(ympa_erlang_proper_client_document_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_document_dto/0]).

-export([ympa_erlang_proper_client_document_dto/1]).

-export_type([ympa_erlang_proper_client_document_dto/0]).

-type ympa_erlang_proper_client_document_dto() ::
  [ {'status', ympa_erlang_proper_client_order_document_status_type:ympa_erlang_proper_client_order_document_status_type() }
  | {'number', binary() }
  | {'date', date() }
  ].


ympa_erlang_proper_client_document_dto() ->
    ympa_erlang_proper_client_document_dto([]).

ympa_erlang_proper_client_document_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_order_document_status_type:ympa_erlang_proper_client_order_document_status_type() }
            , {'number', binary() }
            , {'date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

