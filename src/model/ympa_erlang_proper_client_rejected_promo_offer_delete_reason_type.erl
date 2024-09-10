-module(ympa_erlang_proper_client_rejected_promo_offer_delete_reason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_rejected_promo_offer_delete_reason_type/0]).

-export_type([ympa_erlang_proper_client_rejected_promo_offer_delete_reason_type/0]).

-type ympa_erlang_proper_client_rejected_promo_offer_delete_reason_type() ::
  binary().

ympa_erlang_proper_client_rejected_promo_offer_delete_reason_type() ->
  elements([<<"OFFER_DOES_NOT_EXIST">>]).

