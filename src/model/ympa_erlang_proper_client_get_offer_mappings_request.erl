-module(ympa_erlang_proper_client_get_offer_mappings_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_offer_mappings_request/0]).

-export([ympa_erlang_proper_client_get_offer_mappings_request/1]).

-export_type([ympa_erlang_proper_client_get_offer_mappings_request/0]).

-type ympa_erlang_proper_client_get_offer_mappings_request() ::
  [ {'offerIds', list(binary()) }
  | {'cardStatuses', list(ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type()) }
  | {'categoryIds', list(integer()) }
  | {'vendorNames', list(binary()) }
  | {'tags', list(binary()) }
  | {'archived', boolean() }
  ].


ympa_erlang_proper_client_get_offer_mappings_request() ->
    ympa_erlang_proper_client_get_offer_mappings_request([]).

ympa_erlang_proper_client_get_offer_mappings_request(Fields) ->
  Default = [ {'offerIds', list(binary(), 1, 200) }
            , {'cardStatuses', list(ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type(), 1) }
            , {'categoryIds', list(integer(), 1) }
            , {'vendorNames', list(binary(), 1) }
            , {'tags', list(binary(), 1) }
            , {'archived', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

