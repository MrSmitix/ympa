-module(ympa_erlang_proper_client_put_sku_bids_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_put_sku_bids_request/0]).

-export([ympa_erlang_proper_client_put_sku_bids_request/1]).

-export_type([ympa_erlang_proper_client_put_sku_bids_request/0]).

-type ympa_erlang_proper_client_put_sku_bids_request() ::
  [ {'bids', list(ympa_erlang_proper_client_sku_bid_item_dto:ympa_erlang_proper_client_sku_bid_item_dto()) }
  ].


ympa_erlang_proper_client_put_sku_bids_request() ->
    ympa_erlang_proper_client_put_sku_bids_request([]).

ympa_erlang_proper_client_put_sku_bids_request(Fields) ->
  Default = [ {'bids', list(ympa_erlang_proper_client_sku_bid_item_dto:ympa_erlang_proper_client_sku_bid_item_dto(), 1, 1500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

