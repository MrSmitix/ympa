-module(ympa_erlang_proper_client_feed_publication_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_publication_dto/0]).

-export([ympa_erlang_proper_client_feed_publication_dto/1]).

-export_type([ympa_erlang_proper_client_feed_publication_dto/0]).

-type ympa_erlang_proper_client_feed_publication_dto() ::
  [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
  | {'full', ympa_erlang_proper_client_feed_publication_full_dto:ympa_erlang_proper_client_feed_publication_full_dto() }
  | {'priceAndStockUpdate', ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto:ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto() }
  ].


ympa_erlang_proper_client_feed_publication_dto() ->
    ympa_erlang_proper_client_feed_publication_dto([]).

ympa_erlang_proper_client_feed_publication_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_feed_status_type:ympa_erlang_proper_client_feed_status_type() }
            , {'full', ympa_erlang_proper_client_feed_publication_full_dto:ympa_erlang_proper_client_feed_publication_full_dto() }
            , {'priceAndStockUpdate', ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto:ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

