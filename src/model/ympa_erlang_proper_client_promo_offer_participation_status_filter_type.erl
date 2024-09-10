-module(ympa_erlang_proper_client_promo_offer_participation_status_filter_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_participation_status_filter_type/0]).

-export_type([ympa_erlang_proper_client_promo_offer_participation_status_filter_type/0]).

-type ympa_erlang_proper_client_promo_offer_participation_status_filter_type() ::
  binary().

ympa_erlang_proper_client_promo_offer_participation_status_filter_type() ->
  elements([<<"MANUALLY_ADDED">>, <<"NOT_MANUALLY_ADDED">>]).

