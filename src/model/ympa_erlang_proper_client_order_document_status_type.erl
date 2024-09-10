-module(ympa_erlang_proper_client_order_document_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_document_status_type/0]).

-export_type([ympa_erlang_proper_client_order_document_status_type/0]).

-type ympa_erlang_proper_client_order_document_status_type() ::
  binary().

ympa_erlang_proper_client_order_document_status_type() ->
  elements([<<"READY">>, <<"NOT_READY">>]).

