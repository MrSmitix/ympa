-module(ympa_erlang_proper_client_region_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_region_type/0]).

-export_type([ympa_erlang_proper_client_region_type/0]).

-type ympa_erlang_proper_client_region_type() ::
  binary().

ympa_erlang_proper_client_region_type() ->
  elements([<<"OTHER">>, <<"CONTINENT">>, <<"REGION">>, <<"COUNTRY">>, <<"COUNTRY_DISTRICT">>, <<"REPUBLIC">>, <<"CITY">>, <<"VILLAGE">>, <<"CITY_DISTRICT">>, <<"SUBWAY_STATION">>, <<"REPUBLIC_AREA">>]).

