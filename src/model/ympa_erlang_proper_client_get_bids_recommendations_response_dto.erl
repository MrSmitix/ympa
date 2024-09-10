-module(ympa_erlang_proper_client_get_bids_recommendations_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_bids_recommendations_response_dto/0]).

-export([ympa_erlang_proper_client_get_bids_recommendations_response_dto/1]).

-export_type([ympa_erlang_proper_client_get_bids_recommendations_response_dto/0]).

-type ympa_erlang_proper_client_get_bids_recommendations_response_dto() ::
  [ {'recommendations', list(ympa_erlang_proper_client_sku_bid_recommendation_item_dto:ympa_erlang_proper_client_sku_bid_recommendation_item_dto()) }
  ].


ympa_erlang_proper_client_get_bids_recommendations_response_dto() ->
    ympa_erlang_proper_client_get_bids_recommendations_response_dto([]).

ympa_erlang_proper_client_get_bids_recommendations_response_dto(Fields) ->
  Default = [ {'recommendations', list(ympa_erlang_proper_client_sku_bid_recommendation_item_dto:ympa_erlang_proper_client_sku_bid_recommendation_item_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

