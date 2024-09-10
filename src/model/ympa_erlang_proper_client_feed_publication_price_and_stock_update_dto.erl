-module(ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto/0]).

-export([ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto/1]).

-export_type([ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto/0]).

-type ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto() ::
  [ {'fileTime', datetime() }
  | {'publishedTime', datetime() }
  ].


ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto() ->
    ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto([]).

ympa_erlang_proper_client_feed_publication_price_and_stock_update_dto(Fields) ->
  Default = [ {'fileTime', datetime() }
            , {'publishedTime', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

