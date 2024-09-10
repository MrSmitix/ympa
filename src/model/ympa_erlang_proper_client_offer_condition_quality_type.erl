-module(ympa_erlang_proper_client_offer_condition_quality_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_condition_quality_type/0]).

-export_type([ympa_erlang_proper_client_offer_condition_quality_type/0]).

-type ympa_erlang_proper_client_offer_condition_quality_type() ::
  binary().

ympa_erlang_proper_client_offer_condition_quality_type() ->
  elements([<<"PERFECT">>, <<"EXCELLENT">>, <<"GOOD">>, <<"NOT_SPECIFIED">>]).

