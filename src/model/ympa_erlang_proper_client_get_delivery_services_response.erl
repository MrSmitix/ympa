-module(ympa_erlang_proper_client_get_delivery_services_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_delivery_services_response/0]).

-export([ympa_erlang_proper_client_get_delivery_services_response/1]).

-export_type([ympa_erlang_proper_client_get_delivery_services_response/0]).

-type ympa_erlang_proper_client_get_delivery_services_response() ::
  [ {'result', ympa_erlang_proper_client_delivery_services_dto:ympa_erlang_proper_client_delivery_services_dto() }
  ].


ympa_erlang_proper_client_get_delivery_services_response() ->
    ympa_erlang_proper_client_get_delivery_services_response([]).

ympa_erlang_proper_client_get_delivery_services_response(Fields) ->
  Default = [ {'result', ympa_erlang_proper_client_delivery_services_dto:ympa_erlang_proper_client_delivery_services_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

