-module(ympa_erlang_proper_client_update_outlet_license_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_outlet_license_request/0]).

-export([ympa_erlang_proper_client_update_outlet_license_request/1]).

-export_type([ympa_erlang_proper_client_update_outlet_license_request/0]).

-type ympa_erlang_proper_client_update_outlet_license_request() ::
  [ {'licenses', list(ympa_erlang_proper_client_outlet_license_dto:ympa_erlang_proper_client_outlet_license_dto()) }
  ].


ympa_erlang_proper_client_update_outlet_license_request() ->
    ympa_erlang_proper_client_update_outlet_license_request([]).

ympa_erlang_proper_client_update_outlet_license_request(Fields) ->
  Default = [ {'licenses', list(ympa_erlang_proper_client_outlet_license_dto:ympa_erlang_proper_client_outlet_license_dto(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

