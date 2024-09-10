-module(ympa_erlang_proper_client_outlet_licenses_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_licenses_response_dto/0]).

-export([ympa_erlang_proper_client_outlet_licenses_response_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_licenses_response_dto/0]).

-type ympa_erlang_proper_client_outlet_licenses_response_dto() ::
  [ {'licenses', list(ympa_erlang_proper_client_full_outlet_license_dto:ympa_erlang_proper_client_full_outlet_license_dto()) }
  ].


ympa_erlang_proper_client_outlet_licenses_response_dto() ->
    ympa_erlang_proper_client_outlet_licenses_response_dto([]).

ympa_erlang_proper_client_outlet_licenses_response_dto(Fields) ->
  Default = [ {'licenses', list(ympa_erlang_proper_client_full_outlet_license_dto:ympa_erlang_proper_client_full_outlet_license_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

