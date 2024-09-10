-module(ympa_erlang_proper_client_offer_campaign_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_campaign_status_type/0]).

-export_type([ympa_erlang_proper_client_offer_campaign_status_type/0]).

-type ympa_erlang_proper_client_offer_campaign_status_type() ::
  binary().

ympa_erlang_proper_client_offer_campaign_status_type() ->
  elements([<<"PUBLISHED">>, <<"CHECKING">>, <<"DISABLED_BY_PARTNER">>, <<"DISABLED_AUTOMATICALLY">>, <<"REJECTED_BY_MARKET">>, <<"CREATING_CARD">>, <<"NO_CARD">>, <<"NO_STOCKS">>, <<"ARCHIVED">>]).

