-module(ympa_erlang_proper_client_get_campaign_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_offer_dto/0]).

-export([ympa_erlang_proper_client_get_campaign_offer_dto/1]).

-export_type([ympa_erlang_proper_client_get_campaign_offer_dto/0]).

-type ympa_erlang_proper_client_get_campaign_offer_dto() ::
  [ {'offerId', binary() }
  | {'quantum', ympa_erlang_proper_client_quantum_dto:ympa_erlang_proper_client_quantum_dto() }
  | {'available', boolean() }
  | {'basicPrice', ympa_erlang_proper_client_get_price_with_discount_dto:ympa_erlang_proper_client_get_price_with_discount_dto() }
  | {'campaignPrice', ympa_erlang_proper_client_get_price_with_vat_dto:ympa_erlang_proper_client_get_price_with_vat_dto() }
  | {'status', ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type() }
  | {'errors', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
  | {'warnings', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
  ].


ympa_erlang_proper_client_get_campaign_offer_dto() ->
    ympa_erlang_proper_client_get_campaign_offer_dto([]).

ympa_erlang_proper_client_get_campaign_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'quantum', ympa_erlang_proper_client_quantum_dto:ympa_erlang_proper_client_quantum_dto() }
            , {'available', boolean() }
            , {'basicPrice', ympa_erlang_proper_client_get_price_with_discount_dto:ympa_erlang_proper_client_get_price_with_discount_dto() }
            , {'campaignPrice', ympa_erlang_proper_client_get_price_with_vat_dto:ympa_erlang_proper_client_get_price_with_vat_dto() }
            , {'status', ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type() }
            , {'errors', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
            , {'warnings', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

