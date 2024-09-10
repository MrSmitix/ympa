-module(ympa_erlang_proper_client_affected_order_quality_rating_component_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_affected_order_quality_rating_component_type/0]).

-export_type([ympa_erlang_proper_client_affected_order_quality_rating_component_type/0]).

-type ympa_erlang_proper_client_affected_order_quality_rating_component_type() ::
  binary().

ympa_erlang_proper_client_affected_order_quality_rating_component_type() ->
  elements([<<"DBS_CANCELLATION_RATE">>, <<"DBS_LATE_DELIVERY_RATE">>, <<"FBS_CANCELLATION_RATE">>, <<"FBS_LATE_SHIP_RATE">>]).

