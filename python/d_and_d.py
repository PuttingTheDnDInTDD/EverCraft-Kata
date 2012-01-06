class Character:
    char_name = ""
    char_class = "Human"
    hit_points = 10
    armor_class = 50

    def __init__(self, *args, **kwargs):
        for key in kwargs:
            if hasattr(self, key):
                setattr(self, key, kwargs[key])

    def attack(self, Character):
        pass

if __name__ == "__main__":
    import doctest
    doctest.testmod()
