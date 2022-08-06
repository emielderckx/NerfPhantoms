# phantom
Bukkit plugin which allows nerfing Phantom mobs introduced in Minecraft 1.13

[SpigotMC plugin page](https://www.spigotmc.org/resources/phantom.59218/)

## Configuration
``` yaml
# Whitelist of worlds to enable the plugin in. Includes all worlds by default
enabledWorlds:
- world
- world_nether
- world_the_end

# Disable or enable natural phantom spawn
allowNaturalSpawn: true

# Only apply nerf actions below to naturally spawned phantoms? A non natural spawn would be a spawnegg
onlyNerfNatural: true

# Mute phantom sound (This isn't fully working yet. Only mute some of the phantom sounds)
muteSound: false

# Disable phantom AI. Causes them to hover in one position and not move.
disableAI: false

# Phantom damage to player modifier. PhantomDamage * damageModifier = Damage to player
damageModifier: 1.0

# Set phantom health, default is 20. If you set it to 0 they die instantly.
health: 20.0

# Should all phantoms have a fixed size?
fixedSize:
  enabled: false
  # How big should phantoms be?
  value: 1

# Database configuration (default off)
# The database is used to remember if the player toggled phantoms on or off.
database:
  enabled: false
  type: mysql
  name: phantom
  host: localhost
  port: 3306
  username: root
  password: '123456'
```

## Commands
`/phantom reload`: Reload options from the configuration file\
`/phantom kill`: Kill all Phantoms in your current world.\
`/phantom toggle`: Toggle phantoms spawn for yourself.\
`/phantom toggle <player>`: Toggle phantoms spawn for another player.

## Permissions
``` yaml
  phantom.*:
    description: Gives access to all phantom commands
    default: op
    children:
      phantom.all: true
  phantom.all:
    description: Gives access to all phantom commands
    children:
      phantom.reload: true
      phantom.kill: true
      phantom.disablespawn.self: true
      phantom.disablespawn.other: true
  phantom.reload:
    description: Reload plugin config
    default: false
  phantom.kill:
    description: Kill all phantoms in current world
    default: false
  phantom.disablespawn.self:
    description: Command to disable phantom spawning for self
    default: op
  phantom.disablespawn.others:
    description: Command to disable phantom spawning for other players
    default: op
  phantom.disablespawn.auto:
    description: Phantom spawn disable active by default for player
    default: false
```
