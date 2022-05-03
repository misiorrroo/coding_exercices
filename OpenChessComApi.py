from unicodedata import category
from chessdotcom import get_player_stats
import pprint
printer = pprint.PrettyPrinter()

#def get_player_ratings(username):
#    data = get_player_stats(username).json
#    printer.pprint(data)

#get_player_ratings("Hietmanerro")

def get_player_ratings(username):
    data = get_player_stats(username).json
    categories = ['chess_blitz','chess_bullet','chess_daily']
    for category in categories:
        print('Category:', category)
        print(f"Current: {data[category]['last']['rating']}")
        print(f"Best: {data[category]['best']['rating']}")

get_player_ratings("Hietmanerro")

#https://www.youtube.com/watch?v=KYNbHGs-qG4&t=1004s