-module(ympa_erlang_proper_client_get_campaign_offers_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_offers_request/0]).

-export([ympa_erlang_proper_client_get_campaign_offers_request/1]).

-export_type([ympa_erlang_proper_client_get_campaign_offers_request/0]).

-type ympa_erlang_proper_client_get_campaign_offers_request() ::
  [ {'offerIds', list(binary()) }
  | {'statuses', list(ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type()) }
  | {'categoryIds', list(integer()) }
  | {'vendorNames', list(binary()) }
  | {'tags', list(binary()) }
  ].


ympa_erlang_proper_client_get_campaign_offers_request() ->
    ympa_erlang_proper_client_get_campaign_offers_request([]).

ympa_erlang_proper_client_get_campaign_offers_request(Fields) ->
  Default = [ {'offerIds', list(binary()) }
            , {'statuses', list(ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type()) }
            , {'categoryIds', list(integer()) }
            , {'vendorNames', list(binary()) }
            , {'tags', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

